package at.htl.endpoint;

import at.htl.model.ChatUser;
import at.htl.repository.ChatUserRepository;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Path("chatuser")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Transactional
public class ChatUserEndpoint {

    @Inject
    ChatUserRepository chatUserRepository;

    @GET
    @RolesAllowed("user")
    public List<ChatUser> getAll() {
        return chatUserRepository.findAll().list();
    }

    @GET
    @Path("/{userid}")
    public ChatUser getStudent(@PathParam("userid") String userid) {
        return chatUserRepository.findById(userid);
    }

    @POST
    public Response create(ChatUser s) {
        chatUserRepository.persist(s);
        // return Response.status(201).build();
        return Response.created(URI.create("/students/" + s.userid)).build();
    }

    @PUT
    public Response update(ChatUser s) {
        ChatUser sOld = chatUserRepository.findById(s.userid);
        sOld.lastname = s.lastname;
        sOld.firstname = s.firstname;

        return Response.status(204).build();
    }

    @DELETE
    @Path("/{userid}")
    public Response delete(@PathParam("userid") String userid) {
        chatUserRepository.deleteById(userid);
        return Response.status(204).build();
    }
}

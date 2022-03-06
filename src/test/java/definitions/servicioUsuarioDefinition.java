package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.ResponseBody;
import support.requestUsers;

public class servicioUsuarioDefinition {
    requestUsers user;
    public servicioUsuarioDefinition() {
        user = new requestUsers();
    }
    @Given("Listar Usuarios")
    public void listarUsuarios() {
     user.getUsers();
    }

    @When("Mostrar el listado de usuarios")
    public void mostrarElListadoDeUsuarios() {
        user.getUsers();
        ResponseBody body = requestUsers.responseuser;
        System.out.print(body.asString());
    }
}

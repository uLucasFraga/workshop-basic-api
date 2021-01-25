package tests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.junit.Test;

public class ServeRestTest {

  @Test
  public void postLogin() {
    JSONObject params = new JSONObject();
    params.put("email", "fulano@qa.com");
    params.put("password", "teste");

    given()
        .contentType(ContentType.JSON)
        .body(params.toJSONString())
        .when()
        .post("http://localhost:3000/login")
        .then()
        .statusCode(200)
        .body("message", equalTo("Login realizado com sucesso"));
  }

  @Test
  public void getProducts() {
    given()
        .when()
        .get("http://localhost:3000/produtos")
        .then()
        .statusCode(200)
        .body("produtos.nome[0]", equalTo("Logitech MX Vertical"));
  }
}

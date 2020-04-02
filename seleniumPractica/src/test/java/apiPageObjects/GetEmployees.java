package apiPageObjects;

public class GetEmployees extends ApiSetUp {
	public GetEmployees(String endPoint) {
		super();
		runApi(endPoint);
	}

	public GetEmployees(String endPoint, int id) {
		super();
		runApi(endPoint, id);
	}

	private void runApi(String endPoint) {
		response = request
				.given()
				.when()
				.get(endPoint);
	}

	private void runApi(String endPoint, int id) {
		response = request
				.given()
				.pathParam("id", id)
				.when()
				.get(endPoint);
	}

}

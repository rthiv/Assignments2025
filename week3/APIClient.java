package week3;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		System.out.println("End Point is " + endPoint);
		
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("End Point is " + endPoint + ", Request Body is " + requestBody + " and Request Status is " + requestStatus);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient req = new APIClient();
		req.sendRequest("www.google.com");
		req.sendRequest("www.google.com", "Sample Body", true);
	}

}

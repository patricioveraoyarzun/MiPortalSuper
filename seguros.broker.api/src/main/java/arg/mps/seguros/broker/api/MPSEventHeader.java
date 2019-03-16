package arg.mps.seguros.broker.api;

public class MPSEventHeader {

	private String code;
	private String message;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "MPSEventHeader [code=" + code + ", message=" + message + "]";
	}
	
}

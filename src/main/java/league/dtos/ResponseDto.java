package league.dtos;


public class ResponseDto {

	protected String errorMsg;

	

	public ResponseDto(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public ResponseDto() {
		super();
	}

	
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}

package core.utilites.result;

public class SuccessResult extends Result {
	public SuccessResult() { 	//cevap vermeyeceği için boş bi construction oluştururoruz.
		super(true);
	} 
	
	public SuccessResult(String message) {
		super(true, message);
	} 
}

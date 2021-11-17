package core.utilites.result;

public class ErrorResult extends Result {
	public ErrorResult() { 	//cevap vermeyeceği için boş bi construction oluştururoruz.
		super(false);
	} 
	
	public ErrorResult(String message) {
		super(false, message);
	}
}

import rx.Observer;

public class SimpleObserver implements Observer<String> {

	public void onCompleted() {
		System.out.println("completed....");
	}

	public void onError(Throwable arg0) {
		System.out.println("error......");
	}

	public void onNext(String string) {
		System.out.println(string);
	}
}

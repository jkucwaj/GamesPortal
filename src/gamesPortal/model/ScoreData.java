package gamesPortal.model;

//generic class for storing data
public class ScoreData<T> {

	private T data;

	//constructor
	public ScoreData(T data) {

		this.data = data;
	}

	//return data
	public T getData() {

		return data;
	}

	//change data
	public void setData(T data) {

		this.data = data;
	}
}
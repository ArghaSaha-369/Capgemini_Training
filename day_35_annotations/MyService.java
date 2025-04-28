package day_35_annotations;

public class MyService {
	@Info(name = "FetchData", Version = 1.5)
	public void fetchData() {
		System.out.println("Fetching Data....");
	}
	
	@Info (name = "SaveData")
	public void saveData() {
		System.out.println("Saving Data....");
	}
}

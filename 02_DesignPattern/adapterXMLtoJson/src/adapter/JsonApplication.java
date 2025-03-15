package adapter;

public class JsonApplication {
    private String jsonData;

    public void processData(IJsonData data) {
        this.jsonData = data.getJsonData();
        System.out.println("Processing JSON data: " + jsonData);
    }

    public String getJsonData() {
        return jsonData;
    }
} 
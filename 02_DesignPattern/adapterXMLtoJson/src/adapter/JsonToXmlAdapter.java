package adapter;

public class JsonToXmlAdapter {
    private IJsonData jsonData;

    public JsonToXmlAdapter(IJsonData jsonData) {
        this.jsonData = jsonData;
    }

    public String getXmlData() {
        String json = jsonData.getJsonData();
        return DataConverter.convertJsonToXml(json);
    }

    public void setXmlData(String xmlData) {
        String json = DataConverter.convertXmlToJson(xmlData);
        jsonData.setJsonData(json);
    }
} 
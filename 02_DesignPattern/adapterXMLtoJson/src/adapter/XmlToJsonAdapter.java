package adapter;

public class XmlToJsonAdapter implements IJsonData {
    private XmlData xmlData;

    public XmlToJsonAdapter(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    @Override
    public String getJsonData() {
        String xml = xmlData.getXmlData();
        return DataConverter.convertXmlToJson(xml);
    }

    @Override
    public void setJsonData(String jsonData) {
        String xml = DataConverter.convertJsonToXml(jsonData);
        xmlData.setXmlData(xml);
    }
} 
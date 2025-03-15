package adapter;

import org.json.JSONObject;
import org.json.XML;

public class DataConverter {
    public static String convertXmlToJson(String xml) {
        JSONObject jsonObj = XML.toJSONObject(xml);
        return jsonObj.toString(2);
    }

    public static String convertJsonToXml(String json) {
        JSONObject jsonObj = new JSONObject(json);
        return XML.toString(jsonObj);
    }
} 
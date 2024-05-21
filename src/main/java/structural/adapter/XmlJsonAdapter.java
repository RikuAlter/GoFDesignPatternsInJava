package structural.adapter;

import lombok.Data;
import org.json.JSONObject;
import org.json.XML;

import static org.json.XML.toJSONObject;

@Data
public class XmlJsonAdapter implements IMultiRestoApp{

    private final FancyUiApp fancyUiApp = new FancyUiApp();

    @Override
    public void showMenu(String xmlData) {
        JSONObject jsonData = toJSONObject(xmlData);
        fancyUiApp.showPrettyMenu(jsonData);
    }

    @Override
    public void showResturaunt(String xmlData) {
        JSONObject jsonData = toJSONObject(xmlData);
        fancyUiApp.showPrettyResturant(jsonData);
    }
}

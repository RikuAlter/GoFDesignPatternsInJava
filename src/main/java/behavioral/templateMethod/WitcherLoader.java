package behavioral.templateMethod;

import java.util.Arrays;

public class WitcherLoader extends BaseGameLoader{
    @Override
    protected byte[] loadLocalData() {
        System.out.println("Loading shader and profile cache...");
        return new byte[0];
    }

    @Override
    protected void createGameAssets(byte[] localData) {
        System.out.println("Fetching save data: "+ Arrays.toString(localData) +" to create game assets...");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("Syncing cloud saves...");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("Loading witcher profile...");
    }
}

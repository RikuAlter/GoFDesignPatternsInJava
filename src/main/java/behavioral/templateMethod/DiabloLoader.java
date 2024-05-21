package behavioral.templateMethod;

import java.util.Arrays;

public class DiabloLoader extends BaseGameLoader{
    @Override
    protected byte[] loadLocalData() {
        System.out.println("Loading shader cache...");
        return new byte[0];
    }

    @Override
    protected void createGameAssets(byte[] localData) {
        System.out.println("Using shader cache: "+ Arrays.toString(localData) +" to create game assets...");
    }

    @Override
    protected void downloadAdditionalFiles() {
        System.out.println("Downloading store assets...");
    }

    @Override
    protected void initializeProfiles() {
        System.out.println("Loading player save data...");
    }
}

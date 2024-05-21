package behavioral.templateMethod;

public abstract class BaseGameLoader {

    public final void load(){
        byte[] data = loadLocalData();
        createGameAssets(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    protected abstract byte[] loadLocalData();
    protected abstract void createGameAssets(byte[] localData);
    protected abstract void downloadAdditionalFiles();

    protected void cleanTempFiles(){
        System.gc();
    }

    protected abstract void initializeProfiles();
}

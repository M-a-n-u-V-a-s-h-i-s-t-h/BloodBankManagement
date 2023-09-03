public class DesignID {
    private static DesignID ID = null;

    private DesignID() {

    }

    public static DesignID getInstance()
    {
        if (ID == null)
        {
            ID = new DesignID();
        }
        return ID;
    }
}

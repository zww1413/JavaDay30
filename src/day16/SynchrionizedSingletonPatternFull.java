package day16;

public class SynchrionizedSingletonPatternFull {
    private  SynchrionizedSingletonPatternFull(){};
    private  static SynchrionizedSingletonPatternFull sspf = null;

    public static synchronized SynchrionizedSingletonPatternFull getSspf() {
            if (sspf != null) {
                sspf = new SynchrionizedSingletonPatternFull();
            }
            return sspf;
    }
}

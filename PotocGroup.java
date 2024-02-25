import java.util.List;

public class PotocGroup {

    private Decanat decanat;
    

    public PotocGroup(Decanat decanat) {
        this.decanat = decanat;
    }


    public void dogroup( Object group, BigDecimal amount) {
        decanat.dogroup(amount);
    }
    
}

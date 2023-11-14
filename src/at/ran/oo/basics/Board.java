package at.ran.oo.basics;
import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Info> infos = new ArrayList<Info>();

    public void addInfo(Info info) {
        this.infos.add(info);
    }

    public void printInfos(){
        for (Info info : infos) {
            System.out.println(info.getInfo());
        }
    }
}

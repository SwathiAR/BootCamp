package CrackingCodingInterview.Stacks;

/**
 * Created by root on 12/24/15.
 */
public class TowerOfHanoi {


    Tower[] towers;

    TowerOfHanoi() {
        towers = new Tower[3];
        for (int i = 0; i < 3; i++) {
            towers[i] = new Tower(i);
        }
    }


    public Tower solve(int numberOfDisks) {
        for (int i = numberOfDisks; i > 0; i--) {
            towers[0].add(i);
        }
        towers[0].moveDisks(numberOfDisks, towers[1], towers[2]);

        return towers[2];
    }


    public Tower[] getTowers() {
        return towers;
    }

    public void setTowers(Tower[] towers) {
        this.towers = towers;
    }
}

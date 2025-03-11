public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {
            Fighter firstAttacker = (Math.random() < 0.5) ? f1 : f2;
            Fighter secondAttacker = (firstAttacker == f1) ? f2 : f1;

            System.out.println(firstAttacker.name + " starts the fight!");

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== NEW ROUND ===========");
                secondAttacker.health = firstAttacker.hit(secondAttacker);
                if (isWin()) {
                    break;
                }
                firstAttacker.health = secondAttacker.hit(firstAttacker);
                if (isWin()) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Fighters' weights do not match.");
        }
    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Match Winner: " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Match Winner: " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remaining Health \t:" + f1.health);
        System.out.println(f2.name + " Remaining Health \t:" + f2.health);
    }
}

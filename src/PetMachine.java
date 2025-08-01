public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        } else {
            this.water -= 10;
            this.shampoo -= 2;
            pet.setClean(true);
            System.out.println("o pet " + pet.getName() + " está limpo");
        }
    }

    public void addWater() {
        if (water == 30) {
            System.out.println("A capacidade de água da máquina está no maximo");
            return;
        } else {
            water += 2;
        }
    }

    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("A capacidade de shampoo da máquina está no maximo");
            return;
        } else {
            shampoo += 2;
        }
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public Pet getPet() {
        return this.pet;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina");
    }

    public void removePet() {
        if (this.pet == null) {
            System.out.println("Não tem pet na máquina");
            return;
        } else {
            this.clean = false;
            System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina");
            this.pet = null;
        }
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsalationpractice;

/**
 *
 * @author Mitch
 */
public class Computer {
    Motherboard mobo = new Motherboard();
    RAM rAM = new RAM();
    HardDrive hardDrive = new HardDrive();
    PowerSuply psu = new PowerSuply();
    GraphicsCard gpu = new GraphicsCard();
    CPU cpu = new CPU();
    private boolean hasCPU;
    private boolean hasMobo;
    private boolean hasRam;
    private boolean hasHardDrive;
    private boolean hasPowerSuply;
    private boolean hasGraphicsCard;
    
    
    
    public void buyComputer(){
     buyMobo();
     buyCPU();
     buyRam();
     buyHardDrive();
     buyPowerSupy();
     buyGraphicsCard();
}
    public void assembleComputer(){
        if(hasMobo & hasCPU & hasRam & hasHardDrive & hasPowerSuply & hasGraphicsCard){
            System.out.println("Your computer has been assembled go ahead and enjoy it now.");
        }
            
    }
    private void buyMobo(){
        hasMobo = true;
    }
    private void buyCPU(){
        hasCPU = true;
    }
     private void buyRam(){
        hasRam = true;
    }
      private void buyHardDrive(){
        hasHardDrive = true;
    }
       private void buyPowerSupy(){
        hasPowerSuply = true;
    }
        private void buyGraphicsCard(){
        hasGraphicsCard = true;
    }


    public Motherboard getMobo() {
        return mobo;
    }

    public RAM getrAM() {
        return rAM;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public PowerSuply getPsu() {
        return psu;
    }

    public GraphicsCard getGpu() {
        return gpu;
    }

    public CPU getCpu() {
        return cpu;
    }

    public boolean isHasCPU() {
        return hasCPU;
    }

    public void setHasCPU(boolean hasCPU) {
        this.hasCPU = hasCPU;
    }

    public boolean isHasMobo() {
        return hasMobo;
    }

    public void setHasMobo(boolean hasMobo) {
        this.hasMobo = hasMobo;
    }

    public boolean isHasRam() {
        return hasRam;
    }

    public void setHasRam(boolean hasRam) {
        this.hasRam = hasRam;
    }

    public boolean isHasHardDrive() {
        return hasHardDrive;
    }

    public void setHasHardDrive(boolean hasHardDrive) {
        this.hasHardDrive = hasHardDrive;
    }

    public boolean isHasPowerSuply() {
        return hasPowerSuply;
    }

    public void setHasPowerSuply(boolean hasPowerSuply) {
        this.hasPowerSuply = hasPowerSuply;
    }

    public boolean isHasGraphicsCard() {
        return hasGraphicsCard;
    }

    public void setHasGraphicsCard(boolean hasGraphicsCard) {
        this.hasGraphicsCard = hasGraphicsCard;
    }
    
}

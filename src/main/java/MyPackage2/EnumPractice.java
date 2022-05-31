package MyPackage2;

enum EnumPractice {
    RED("STOP"), GREEN("GO"), YELLOW("SLOW DOWN");

    private String action;

    public String getAction() {
        return this.action;
    }

    private EnumPractice (String action){
        this.action = action;

    }
}

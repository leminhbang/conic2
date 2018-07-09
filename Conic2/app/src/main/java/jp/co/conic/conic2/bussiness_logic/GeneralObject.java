package jp.co.conic.conic2.bussiness_logic;

public class GeneralObject {

    // Width of die
    private float v;
    // Minimum length of flange
    private float b;
    // Radius of punch tip
    private float ir;
    // Pressure par 1mm (KN/mm)
    private float F;

    public GeneralObject(float v,
                         float b,
                         float ir,
                         float F)
    {
        this.v = v;
        this.b = b;
        this.ir = ir;
        this.F = F;
    }

    public float get_v() {
        return this.v;
    }

    public float get_b() {
        return this.b;
    }

    public float get_ir() {
        return this.ir;
    }

    public float get_F() {
        return this.F;
    }
}

package jp.co.conic.conic2.bussiness_logic;

import java.util.List;

public class CalculationHelper {

    private int material;
    private float thickness;
    private float bending_length;
    private float bending_angle;

    MildSteel mild_steel;
    StainlessSteel stainless_steel;

    public CalculationHelper(int material,
                             float thickness,
                             float bending_length,
                             float bending_angle)
    {
        this.material = material;
        this.thickness = thickness;
        this.bending_length = bending_length;
        this.bending_angle = bending_angle;

        if(material == 0) {
            mild_steel = new MildSteel(thickness);
        }

        if(material == 1) {
            stainless_steel = new StainlessSteel(thickness);
        }
    }

    public List<String> get_v_list() {
        if(this.material == 0) {
            return mild_steel.get_v();
        }
        if(material == 1) {
            return stainless_steel.get_v();
        }
        return null;
    }

    public float get_b(float v) {
        if(this.material == 0) {
            return this.mild_steel.getGeneralObject(v).get_b();
        }
        if(material == 1) {
            return this.stainless_steel.getGeneralObject(v).get_b();
        }
        return -1;
    }

    public float get_ir(float v) {
        if(this.material == 0) {
            return this.mild_steel.getGeneralObject(v).get_ir();
        }
        if(material == 1) {
            return this.stainless_steel.getGeneralObject(v).get_ir();
        }
        return -1;
    }

    public float get_F(float v) {
        if(this.material == 0) {
            return this.mild_steel.getGeneralObject(v).get_F();
        }
        if(material == 1) {
            return this.stainless_steel.getGeneralObject(v).get_F();
        }
        return -1;
    }

    public float get_Temp1(float v) {
        if(this.material == 0) {
            return (this.mild_steel.getGeneralObject(v).get_F() * this.bending_length)/1000.0f;
        }
        if(material == 1) {
            return (this.stainless_steel.getGeneralObject(v).get_F() * this.bending_length)/1000.0f;
        }
        return -1;
    }
}

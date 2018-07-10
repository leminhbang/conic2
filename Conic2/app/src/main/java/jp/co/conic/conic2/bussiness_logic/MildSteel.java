package jp.co.conic.conic2.bussiness_logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MildSteel {

    private Map<Float, List<GeneralObject>> mMildSteel;
    private List<GeneralObject> lGeneralObject;

    public MildSteel(float t) {
        mMildSteel = new HashMap<Float, List<GeneralObject>>();
        lGeneralObject = new ArrayList<GeneralObject>();

        if(t == 0.5) {
            lGeneralObject.add(new GeneralObject(4, (float) 2.8, (float) 0.7,40));
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,30));
            mMildSteel.put((float) 0.5, lGeneralObject);
        }

        if(t == 0.6) {
            lGeneralObject.add(new GeneralObject(4, (float) 2.8, (float) 0.7,60));
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,40));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,40));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,40));
            mMildSteel.put((float) 0.6, lGeneralObject);
        }

        if(t == 0.8) {
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,70));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,70));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,50));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,40));
            mMildSteel.put((float) 0.8, lGeneralObject);
        }

        if(t == 1.0) {
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,110));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,100));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,80));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,70));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,60));
            mMildSteel.put((float) 1.0, lGeneralObject);
        }

        if(t == 1.2) {
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,140));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,120));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,110));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,80));
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,70));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,60));
            mMildSteel.put((float) 1.2, lGeneralObject);
        }

        if(t == 1.4) {
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,150));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,130));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,110));
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,100));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,90));
            lGeneralObject.add(new GeneralObject(18, (float) 13.5, (float) 3,80));
            mMildSteel.put((float) 1.4, lGeneralObject);
        }

        if(t == 1.6) {
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,170));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,150));
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,130));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,110));
            lGeneralObject.add(new GeneralObject(18, (float) 13.5, (float) 3,100));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,90));
            mMildSteel.put((float) 1.6, lGeneralObject);
        }

        if(t == 2.0) {
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,220));
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,190));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,170));
            lGeneralObject.add(new GeneralObject(18, (float) 13.5, (float) 3,150));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,130));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,110));
            mMildSteel.put((float) 2.0, lGeneralObject);
        }

        if(t == 2.3) {
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,250));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,230));
            lGeneralObject.add(new GeneralObject(18, (float) 13.5, (float) 3,190));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,170));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,150));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,120));
            mMildSteel.put((float) 2.3, lGeneralObject);
        }

        if(t == 2.6) {
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,280));
            lGeneralObject.add(new GeneralObject(18, (float) 13.5, (float) 3,250));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,220));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,180));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,140));
            mMildSteel.put((float) 2.6, lGeneralObject);
        }

        if(t == 3.0) {
            lGeneralObject.add(new GeneralObject(18, (float) 13.5, (float) 3,340));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,300));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,240));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,190));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,150));
            mMildSteel.put((float) 3.0, lGeneralObject);
        }

        if(t == 3.2) {
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,340));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,270));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,220));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,170));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,140));
            mMildSteel.put((float) 3.2, lGeneralObject);
        }

        if(t == 3.5) {
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,330));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,260));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,200));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,160));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,130));
            mMildSteel.put((float) 3.5, lGeneralObject);
        }

        if(t == 4.0) {
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,430));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,340));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,270));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,210));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,170));
            mMildSteel.put((float) 4.0, lGeneralObject);
        }

        if(t == 4.5) {
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,440));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,340));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,270));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,210));
            mMildSteel.put((float) 4.5, lGeneralObject);
        }

        if(t == 5.0) {
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,520));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,420));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,330));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,260));
            lGeneralObject.add(new GeneralObject(80, (float) 55, (float) 13,210));
            mMildSteel.put((float) 5.0, lGeneralObject);
        }

        if(t == 6.0) {
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,600));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,480));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,380));
            lGeneralObject.add(new GeneralObject(80, (float) 55, (float) 13,300));
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,240));
            mMildSteel.put((float) 6.0, lGeneralObject);
        }

        if(t == 7.0) {
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,520));
            lGeneralObject.add(new GeneralObject(80, (float) 55, (float) 13,410));
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,330));
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,260));
            mMildSteel.put((float) 7.0, lGeneralObject);
        }

        if(t == 9.0) {
            lGeneralObject.add(new GeneralObject(80, (float) 55, (float) 13,670));
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,540));
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,430));
            mMildSteel.put((float) 9.0, lGeneralObject);
        }

        if(t == 10.0) {
            lGeneralObject.add(new GeneralObject(80, (float) 55, (float) 13,850));
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,670));
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,530));
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,420));
            mMildSteel.put((float) 10.0, lGeneralObject);
        }

        if(t == 12.0) {
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,960));
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,780));
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,600));
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,550));
            mMildSteel.put((float) 12.0, lGeneralObject);
        }

        if(t == 16.0) {
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,1360));
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,1070));
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,860));
            mMildSteel.put((float) 16.0, lGeneralObject);
        }

        if(t == 19.0) {
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,1500));
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,1250));
            lGeneralObject.add(new GeneralObject(250, (float) 175, (float) 41,1000));
            mMildSteel.put((float) 19.0, lGeneralObject);
        }

        if(t == 22.0) {
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,1600));
            lGeneralObject.add(new GeneralObject(250, (float) 175, (float) 41,1300));
            mMildSteel.put((float) 22.0, lGeneralObject);
        }

        if(t == 25.0) {
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,2100));
            lGeneralObject.add(new GeneralObject(250, (float) 175, (float) 41,1700));
            mMildSteel.put((float) 25.0, lGeneralObject);
        }

        if(t == 30.0) {
            lGeneralObject.add(new GeneralObject(250, (float) 175, (float) 41,2400));
            mMildSteel.put((float) 30.0, lGeneralObject);
        }
    }

    public List<String> get_v() {
        List<String> v_list = new ArrayList<String>();
        for(int i = 0; i < lGeneralObject.size(); i++) {
            v_list.add(Float.toString(lGeneralObject.get(i).get_v()));
        }
        return v_list;
    }

    public GeneralObject getGeneralObject(float v) {
        for(int i = 0; i < lGeneralObject.size(); i++) {
            if(lGeneralObject.get(i).get_v() == v) {
                return lGeneralObject.get(i);
            }
        }
        return null;
    }
}

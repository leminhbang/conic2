package jp.co.conic.conic2.bussiness_logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StainlessSteel {
    private Map<Float, List<GeneralObject>> mStainlessSteel;
    private List<GeneralObject> lGeneralObject;

    public StainlessSteel(float t) {
        mStainlessSteel = new HashMap<Float, List<GeneralObject>>();
        lGeneralObject = new ArrayList<GeneralObject>();

        if(t == 0.5) {
            lGeneralObject.add(new GeneralObject(4, (float) 2.8, (float) 0.7,60));
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,50));
            mStainlessSteel.put((float) 0.5, lGeneralObject);
        }

        if(t == 0.6) {
            lGeneralObject.add(new GeneralObject(4, (float) 2.8, (float) 0.7,90));
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,60));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,60));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,60));
            mStainlessSteel.put((float) 0.6, lGeneralObject);
        }

        if(t == 0.7) {
            lGeneralObject.add(new GeneralObject(4, (float) 2.8, (float) 0.7,120));
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,80));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,80));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,60));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,60));
            mStainlessSteel.put((float) 0.7, lGeneralObject);
        }

        if(t == 0.8) {
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,110));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,110));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,80));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,60));
            mStainlessSteel.put((float) 0.8, lGeneralObject);
        }

        if(t == 0.9) {
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,130));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,120));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,100));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,90));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,70));
            mStainlessSteel.put((float) 0.9, lGeneralObject);
        }

        if(t == 1.0) {
            lGeneralObject.add(new GeneralObject(6, (float) 4, (float) 1,170));
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,150));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,120));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,110));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,90));
            mStainlessSteel.put((float) 1.0, lGeneralObject);
        }

        if(t == 1.2) {
            lGeneralObject.add(new GeneralObject(7, (float) 5, (float) 1.1,210));
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,180));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,150));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,120));
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,110));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,90));
            mStainlessSteel.put((float) 1.2, lGeneralObject);
        }

        if(t == 1.5) {
            lGeneralObject.add(new GeneralObject(8, (float) 5.5, (float) 1.3,290));
            lGeneralObject.add(new GeneralObject(10, (float) 7, (float) 1.6,230));
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,200));
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,170));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,150));
            lGeneralObject.add(new GeneralObject(18, (float) 13, (float) 3,130));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,120));
            mStainlessSteel.put((float) 1.5, lGeneralObject);
        }

        if(t == 2.0) {
            lGeneralObject.add(new GeneralObject(12, (float) 8.5, (float) 2,330));
            lGeneralObject.add(new GeneralObject(14, (float) 10, (float) 2.3,290));
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,260));
            lGeneralObject.add(new GeneralObject(18, (float) 13, (float) 3,230));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,200));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,170));
            mStainlessSteel.put((float) 2.0, lGeneralObject);
        }

        if(t == 2.5) {
            lGeneralObject.add(new GeneralObject(16, (float) 11, (float) 2.6,390));
            lGeneralObject.add(new GeneralObject(18, (float) 13, (float) 3,350));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,300));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,250));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,190));
            mStainlessSteel.put((float) 2.5, lGeneralObject);
        }

        if(t == 3.0) {
            lGeneralObject.add(new GeneralObject(18, (float) 13, (float) 3,510));
            lGeneralObject.add(new GeneralObject(20, (float) 14, (float) 3.3,450));
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,360));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,290));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,230));
            mStainlessSteel.put((float) 3.0, lGeneralObject);
        }

        if(t == 4.0) {
            lGeneralObject.add(new GeneralObject(25, (float) 17.5, (float) 4,650));
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,510));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,410));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,320));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,260));
            mStainlessSteel.put((float) 4.0, lGeneralObject);
        }

        if(t == 5.0) {
            lGeneralObject.add(new GeneralObject(32, (float) 22, (float) 5,780));
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,630));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,500));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,390));
            lGeneralObject.add(new GeneralObject(80, (float) 57, (float) 13,320));
            mStainlessSteel.put((float) 5.0, lGeneralObject);
        }

        if(t == 6.0) {
            lGeneralObject.add(new GeneralObject(40, (float) 28, (float) 6.5,900));
            lGeneralObject.add(new GeneralObject(50, (float) 35, (float) 8,720));
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,570));
            lGeneralObject.add(new GeneralObject(80, (float) 57, (float) 13,450));
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,360));
            mStainlessSteel.put((float) 6.0, lGeneralObject);
        }

        if(t == 8.0) {
            lGeneralObject.add(new GeneralObject(63, (float) 45, (float) 10,1020));
            lGeneralObject.add(new GeneralObject(80, (float) 57, (float) 13,810));
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,650));
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,510));
            mStainlessSteel.put((float) 8.0, lGeneralObject);
        }

        if(t == 10.0) {
            lGeneralObject.add(new GeneralObject(80, (float) 57, (float) 13,1280));
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,1010));
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,800));
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,630));
            mStainlessSteel.put((float) 10.0, lGeneralObject);
        }

        if(t == 12.0) {
            lGeneralObject.add(new GeneralObject(100, (float) 71, (float) 16,1440));
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,1170));
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,900));
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,830));
            mStainlessSteel.put((float) 12.0, lGeneralObject);
        }

        if(t == 15.0) {
            lGeneralObject.add(new GeneralObject(125, (float) 89, (float) 20,1800));
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,1410));
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,1140));
            mStainlessSteel.put((float) 15.0, lGeneralObject);
        }

        if(t == 20.0) {
            lGeneralObject.add(new GeneralObject(160, (float) 113, (float) 26,2500));
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,2080));
            lGeneralObject.add(new GeneralObject(250, (float) 175, (float) 41,1670));
            mStainlessSteel.put((float) 20.0, lGeneralObject);
        }

        if(t == 25.0) {
            lGeneralObject.add(new GeneralObject(200, (float) 140, (float) 33,3150));
            lGeneralObject.add(new GeneralObject(250, (float) 175, (float) 41,2550));
            mStainlessSteel.put((float) 25.0, lGeneralObject);
        }

        if(t == 30.0) {
            lGeneralObject.add(new GeneralObject(250, (float) 175, (float) 41,3600));
            mStainlessSteel.put((float) 30.0, lGeneralObject);
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

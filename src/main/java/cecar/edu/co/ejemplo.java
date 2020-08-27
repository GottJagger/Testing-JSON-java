/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cecar.edu.co;

import us.monoid.json.JSONObject;
import us.monoid.web.JSONResource;
import us.monoid.web.Resty;

/**
 *
 * @author oderb
 */
public class ejemplo {

    public ejemplo(String url) {

        String resultado = "";

        try {
            JSONResource js = new Resty().json(url);
            JSONObject jsonroot = js.object();
            JSONObject jsonUSDCOL = jsonroot.getJSONObject("USDCOL");
            resultado = jsonUSDCOL.get("setfxxsell").toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
    }

}

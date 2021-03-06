package cn.com.gottado.tool.http;

import org.json.JSONObject;

import cn.com.gottado.tool.util.JsonTools;


/**
 * Created by liaozp on 16/5/17.
 */
public abstract class JsonCallBack extends XCallBack<JSONObject>{

    @Override
    public void onCancelled(Exception e) {

    }

    @Override
    public void onFinished() {

    }

    @Override
    public void onError(Throwable throwable, boolean b) {

    }
    @Override
    public JSONObject getResult(String result) {
        return JsonTools.generateJsonObj(result);
    }
}

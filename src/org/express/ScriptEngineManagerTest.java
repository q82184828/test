package org.express;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * 将字符串里的表达式进行运算
 * @Author chenfei
 * @Date 2017年10月27日 上午8:55:43
 */
public class ScriptEngineManagerTest {
public static void main(String[] args) throws ScriptException {
	String v1 = "12";
	String v2 = "14";
	String operator = ">=";
	String str = "(a >= 0 && a <= 5)";
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("js");
    engine.put("a",4);
    Object result = engine.eval(v1 + operator + v2);
     
    System.out.println("结果类型:" + result.getClass().getName() + ",计算结果:" + result);
}
}

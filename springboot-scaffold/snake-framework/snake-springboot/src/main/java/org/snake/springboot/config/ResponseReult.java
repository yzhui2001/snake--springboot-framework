/**
 * 
 */
package org.snake.springboot.config;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;;
/**
 * @author yzhui
 * @param <T>
 *
 */
@Data
@NoArgsConstructor
public class ResponseReult<T> implements Serializable{
	
	/**
	 * 唯一识别.
	 */
	private static final long serialVersionUID = 8622830887896135137L;
	
	public static final String CODE_UCC="0";
	public static final String CODE_FAIL="1";
	public static final String CODE_ERR="-1";	

	private String code;
	private String msg;
    private T data;
    private int count;
    private String msgNum;
    
    public ResponseReult(String code,String msg,T data,int count,String msgNum){
		this.code = code;
		this.msg = msg;
		this.data = data;
		this.count = count;	
		this.msgNum = msgNum;
	}
}

/*package com.cg.onlinebookstoremanagementsystem.exception;

public class ResourceNotFoundException extends Exception{
	
	public ResourceNotFoundException(String exMsg) {
		super(exMsg);
	}

}*/

package com.cg.onlinebookstoremanagementsystem.exception;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ResourceNotFoundException(String message)
	{
		super(message);
		
	}
	
}

/**
 * 
 */
package hello.basis;

import org.eventb.core.basis.EventBElement;
import org.rodinp.core.IInternalElement;
import org.rodinp.core.IInternalElementType;
import org.rodinp.core.IRodinElement;

/**
 * 
 */
public class Bound extends EventBElement implements IBound {

	/**
	 * @param name
	 * @param parent
	 */
	public Bound(String name, IRodinElement parent) {
		super(name, parent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public IInternalElementType<? extends IInternalElement> getElementType() {
		// TODO Auto-generated method stub
		return IBound.ELEMENT_TYPE;
	}

}

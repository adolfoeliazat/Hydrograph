
/*******************************************************************************
 * Copyright 2017 Capital One Services, LLC and Bitwise, Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package hydrograph.engine.jaxb.groupcombine;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * The Class ObjectFactory .
 *
 * @author Bitwise
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hydrograph.engine.jaxb.groupcombine
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeOperation }
     * 
     */
    public TypeOperation createTypeOperation() {
        return new TypeOperation();
    }

    /**
     * Create an instance of {@link GroupcombineBase }
     * 
     */
    public GroupcombineBase createGroupcombineBase() {
        return new GroupcombineBase();
    }

    /**
     * Create an instance of {@link TypeOutSocket }
     * 
     */
    public TypeOutSocket createTypeOutSocket() {
        return new TypeOutSocket();
    }

    /**
     * Create an instance of {@link TypeOperationInputFields }
     * 
     */
    public TypeOperationInputFields createTypeOperationInputFields() {
        return new TypeOperationInputFields();
    }

    /**
     * Create an instance of {@link TypeInSocket }
     * 
     */
    public TypeInSocket createTypeInSocket() {
        return new TypeInSocket();
    }

    /**
     * Create an instance of {@link TypeTransformExpression }
     * 
     */
    public TypeTransformExpression createTypeTransformExpression() {
        return new TypeTransformExpression();
    }

    /**
     * Create an instance of {@link TypeOutSocketAsInSocketIn0 }
     * 
     */
    public TypeOutSocketAsInSocketIn0 createTypeOutSocketAsInSocketIn0() {
        return new TypeOutSocketAsInSocketIn0();
    }

    /**
     * Create an instance of {@link TypeOperationInputField }
     * 
     */
    public TypeOperationInputField createTypeOperationInputField() {
        return new TypeOperationInputField();
    }

    /**
     * Create an instance of {@link TypePrimaryKeyFields }
     * 
     */
    public TypePrimaryKeyFields createTypePrimaryKeyFields() {
        return new TypePrimaryKeyFields();
    }

}

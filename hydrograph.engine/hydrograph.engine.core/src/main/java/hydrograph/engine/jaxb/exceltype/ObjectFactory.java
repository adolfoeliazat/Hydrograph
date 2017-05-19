
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

package hydrograph.engine.jaxb.exceltype;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * The Class ObjectFactory .
 *
 * @author Bitwise
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: hydrograph.engine.jaxb.exceltype
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeExcelField }
     * 
     */
    public TypeExcelField createTypeExcelField() {
        return new TypeExcelField();
    }

    /**
     * Create an instance of {@link TypeExcelRecord }
     * 
     */
    public TypeExcelRecord createTypeExcelRecord() {
        return new TypeExcelRecord();
    }

    /**
     * Create an instance of {@link TypeExcelOutSocket }
     * 
     */
    public TypeExcelOutSocket createTypeExcelOutSocket() {
        return new TypeExcelOutSocket();
    }

    /**
     * Create an instance of {@link TypeFileExcelBase }
     * 
     */
    public TypeFileExcelBase createTypeFileExcelBase() {
        return new TypeFileExcelBase();
    }

}
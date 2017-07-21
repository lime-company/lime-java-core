/*
 * Copyright 2017 Lime - HighTech Solutions s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.getlime.core.rest.model.base.entity;

/**
 * Transport object for RESTful API representing an error instance.
 *
 * @author Petr Dvorak, petr@lime-company.eu
 */
public class Error {

    /**
     * List of defined error code constants.
     */
    public class Code {
        /**
         * Generic error occurred.
         */
        public static final String ERROR_GENERIC = "ERROR_GENERIC";
    }

    /**
     * List of defined message constants.
     */
    public class Message {
        /**
         * Unknown error.
         */
        public static final String UNKNOWN_ERROR = "UNKNOWN_ERROR";
    }

    private String code;
    private String message;

    /**
     * Constructor accepting code and message.
     *
     * @param code    Error code.
     * @param message Error message.
     */
    public Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Return new default generic error object.
     * @return Generic error object with unknown cause of error.
     */
    public static Error genericError() {
        return new Error(Code.ERROR_GENERIC, Message.UNKNOWN_ERROR);
    }

    /**
     * Get error code.
     *
     * @return Error code.
     */
    public String getCode() {
        return code;
    }

    /**
     * Set error code.
     *
     * @param code Error code.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Get error message.
     *
     * @return Error message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set error message.
     *
     * @param message Error message.
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
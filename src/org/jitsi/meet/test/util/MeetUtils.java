/*
 * Copyright @ 2015 Atlassian Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jitsi.meet.test.util;

import org.openqa.selenium.*;

/**
 * Class contains utility methods related with jitsi-meet application logic.
 *
 * @author Pawel Domas
 */
public class MeetUtils
{
    /**
     * Returns resource JID which corresponds to XMPP MUC nickname of the given
     * <tt>participant</tt>.
     *
     * @param participant the <tt>WebDriver</tt> instance which runs conference
     *                    participant.
     */
    public static String getResourceJid(WebDriver participant)
    {
        return (String)((JavascriptExecutor) participant)
            .executeScript("return APP.xmpp.myResource();");
    }
}

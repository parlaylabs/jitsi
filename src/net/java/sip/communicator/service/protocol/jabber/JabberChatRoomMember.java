/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
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
package net.java.sip.communicator.service.protocol.jabber;

import net.java.sip.communicator.service.protocol.*;
import org.jivesoftware.smack.packet.*;

/**
 * {@link ChatRoomMember} interface extension that provides additional
 * methods specific to Jabber protocol.
 *
 * @author Pawel Domas
 */
public interface JabberChatRoomMember
    extends ChatRoomMember
{
    /**
     * Returns the Jabber ID of the member.
     * @return the Jabber ID or <tt>null</tt> if we don't have enough
     *         permissions to look up user's JID.
     */
    public String getJabberID();

    /**
     * @return the last received {@link Presence} from this
     * {@link ChatRoomMember}.
     */
    public Presence getPresence();
}

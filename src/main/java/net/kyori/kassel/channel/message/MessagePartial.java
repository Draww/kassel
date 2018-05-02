/*
 * This file is part of kassel, licensed under the MIT License.
 *
 * Copyright (c) 2018 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.kassel.channel.message;

import net.kyori.cereal.Document;
import net.kyori.kassel.channel.message.embed.Embed;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * Partials that make up a whole {@link Message}.
 */
public interface MessagePartial {
  /**
   * A partial representing content.
   */
  interface ContentPartial extends Document {
    /**
     * Gets the content.
     *
     * @return the content
     */
    @NonNull String content();
  }

  /**
   * A partial representing an embed.
   */
  interface EmbedPartial extends Document {
    /**
     * Gets the embed.
     *
     * @return the embed
     */
    @NonNull Embed embed();
  }
}

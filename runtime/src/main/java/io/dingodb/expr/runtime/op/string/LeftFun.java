/*
 * Copyright 2021 DataCanvas
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

package io.dingodb.expr.runtime.op.string;

import io.dingodb.expr.annotations.Operators;
import org.checkerframework.checker.nullness.qual.NonNull;

@Operators
abstract class LeftFun extends BinaryStringIntFun {
    public static final String NAME = "LEFT";

    private static final long serialVersionUID = 7001019395517413765L;

    static @NonNull String left(@NonNull String value, int count) {
        if (count > 0) {
            return count < value.length() ? value.substring(0, count) : value;
        }
        return "";
    }

    @Override
    public @NonNull String getName() {
        return NAME;
    }
}

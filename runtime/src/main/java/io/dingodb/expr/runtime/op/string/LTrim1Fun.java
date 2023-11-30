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
import org.apache.commons.lang3.StringUtils;
import org.checkerframework.checker.nullness.qual.NonNull;

@Operators
abstract class LTrim1Fun extends UnaryStringFun {
    public static final String NAME = "LTRIM";

    private static final long serialVersionUID = -8557732786466948967L;

    static @NonNull String ltrim(@NonNull String value) {
        return StringUtils.stripStart(value, null);
    }

    @Override
    public @NonNull String getName() {
        return NAME;
    }
}

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

import java.util.regex.Pattern;

@Operators
public class MatchesIgnoreCaseFun extends BinaryStringStringFun {
    public static final String NAME = "MATCHES_NC";

    private static final long serialVersionUID = -6896129009907506751L;

    static boolean matchesNc(@NonNull String value0, @NonNull String value1) {
        Pattern pattern = Pattern.compile(value1, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(value0).matches();
    }

    @Override
    public @NonNull String getName() {
        return NAME;
    }
}

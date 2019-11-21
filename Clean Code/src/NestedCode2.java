public class NestedCode2 {
    //Bad Example for nested Code
    class Bad_Nested_Code {
        public boolean do_stuff_Nested() {
            if (is_writable($folder)) {

                if ($fp = fopen($file_path, 'w')) {

                    if ($stuff = get_some_stuff()) {

                        if (fwrite($fp, $stuff)) {

                            // ...

                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
            return true;
        }
    }

    class Good_Nested_Code {
        public boolean do_stuff_With_NestedCode() {
            if (!is_writable($folder)) {
                return false;
            }

            if (!$fp = fopen($file_path, 'w')) {
                return false;
            }

            if (!$stuff = get_some_stuff()) {
                return false;
            }

            if (fwrite($fp, $stuff)) {
                // ...
            } else {
                return false;
            }
        }
    }

}

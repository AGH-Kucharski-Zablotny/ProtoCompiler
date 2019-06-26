package pl.edu.agh.tkik;
public class MyProtoCompilationResult {
    class MyMessage1 {
        private Integer intField;

        public Integer getIntField() {
            return intField;
        }

        public void setIntField(Integer item) {
            this.intField = item;
        }

        private Long longField;

        public Long getLongField() {
            return longField;
        }

        public void setLongField(Long item) {
            this.longField = item;
        }

        private Integer uintField;

        public Integer getUintField() {
            return uintField;
        }

        public void setUintField(Integer item) {
            this.uintField = item;
        }

        private Long ulongField;

        public Long getUlongField() {
            return ulongField;
        }

        public void setUlongField(Long item) {
            this.ulongField = item;
        }

        private Integer sintField;

        public Integer getSintField() {
            return sintField;
        }

        public void setSintField(Integer item) {
            this.sintField = item;
        }

        private Long slongField;

        public Long getSlongField() {
            return slongField;
        }

        public void setSlongField(Long item) {
            this.slongField = item;
        }

        private java.util.List<String> listField;

        public java.util.List<String> getListField() {
            return listField;
        }

        public void setListField(java.util.List<String> item) {
            this.listField = item;
        }


    }

    class MyMessage2 {
        private Integer fixedIntField;

        public Integer getFixedIntField() {
            return fixedIntField;
        }

        public void setFixedIntField(Integer item) {
            this.fixedIntField = item;
        }

        private Long fixedLongField;

        public Long getFixedLongField() {
            return fixedLongField;
        }

        public void setFixedLongField(Long item) {
            this.fixedLongField = item;
        }

        private Integer sfixedIntField;

        public Integer getSfixedIntField() {
            return sfixedIntField;
        }

        public void setSfixedIntField(Integer item) {
            this.sfixedIntField = item;
        }

        private Long sfixedLongField;

        public Long getSfixedLongField() {
            return sfixedLongField;
        }

        public void setSfixedLongField(Long item) {
            this.sfixedLongField = item;
        }

        private Boolean logicField;

        public Boolean getLogicField() {
            return logicField;
        }

        public void setLogicField(Boolean item) {
            this.logicField = item;
        }

        private String strField;

        public String getStrField() {
            return strField;
        }

        public void setStrField(String item) {
            this.strField = item;
        }

        java.util.Map<Integer, String> mField;

        public java.util.Map<Integer, String> getMField() {
            return this.mField;
        }

        public void setMField(java.util.Map<Integer, String> item) {
            this.mField = item;
        }


    }

    enum MyEnum {
        ONE,
        TWO,
        THREE,
        ;
    }

    interface MyService {
        MyMessage2 interfaceMethod1(MyMessage1 request);

        MyMessage1 interfaceMethod2(MyMessage2 request);
    }
}
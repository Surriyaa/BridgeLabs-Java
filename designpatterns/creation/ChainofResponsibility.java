    package designpatterns.creation;

    // Abstract Handler
    abstract class EmailFilter {
        protected EmailFilter nextFilter;

        public void setNextFilter(EmailFilter nextFilter) {
            this.nextFilter = nextFilter;
        }

        public abstract void processEmail(String email);
    }

    class SpamFilter extends EmailFilter{
        @Override
        public void processEmail(String email){
            if (email.contains("buy now")) {
                System.out.println("Email marked as Spam");
            }
            else if (nextFilter!=null) {
                nextFilter.processEmail(email);
            }
        }
    }

    class ImportantFilter extends EmailFilter{
        @Override
        public void processEmail(String email){
            if(email.contains("Urgent")){
                System.out.println("Email marked as Important");
            }
            else if (nextFilter!=null) {
                nextFilter.processEmail(email);
            }
        }
    }

    class PromotionFilter extends EmailFilter{
        @Override
        public void processEmail(String email){
            if(email.contains("sale")){
                System.out.println("Email marked as Promotion");
            }
            else if (nextFilter!=null) {
                nextFilter.processEmail(email);
            }
        }
    }

    public class ChainofResponsibility{
        public static void main(String[] args) {
            EmailFilter spamFilter=new SpamFilter();
            EmailFilter importantFilter= new ImportantFilter();
            EmailFilter promotionFilter=new PromotionFilter();

            spamFilter.setNextFilter(importantFilter);
            importantFilter.setNextFilter(promotionFilter);

            // Client requests to process emails
        System.out.println("Processing email 1:");
        spamFilter.processEmail("Hurry! buy now and get 50% off");

        System.out.println("\nProcessing email 2:");
        spamFilter.processEmail("Urgent: Your account has been hacked!");

        System.out.println("\nProcessing email 3:");
        spamFilter.processEmail("Big sale this weekend on all products");
        }
    }













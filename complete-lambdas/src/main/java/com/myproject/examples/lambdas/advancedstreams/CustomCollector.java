package com.myproject.examples.lambdas.advancedstreams;

import com.myproject.examples.lambdas.domain.Trade;
import com.myproject.examples.lambdas.util.TradeUtil;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class CustomCollector {

    List<Trade> trades = TradeUtil.createTrades();

    private void collectToCustomCollector(){
        //A supplier
        Supplier<StringBuilder> supplier = StringBuilder::new;

        //An accumulator
        BiConsumer<StringBuilder, Trade> accumulator = (sb, trade) -> sb.append(trade.getInstrument()).append(",");

        //A combiner
        BiConsumer<StringBuilder, StringBuilder> combiner = (s1, s2) -> s1.append(s2.toString());

        //putting all together
        StringBuilder results = trades.stream().collect(supplier, accumulator, combiner);
        System.out.println(results);
    }

    public static void main(String[] args){
        new CustomCollector().collectToCustomCollector();
    }


}

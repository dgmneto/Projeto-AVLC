/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avlc.projeto.matrix;

import java.util.ArrayList;

/**
 *
 * @author divinoneto
 */
public class Matrix {
    private ArrayList<ArrayList<Integer>> rows;
    private ArrayList<ArrayList<Integer>> columns;
    private ArrayList<Integer[]> starredZeros;
    private ArrayList<Integer[]> primedZeros;
    private ArrayList<Integer> coveredRows;
    private ArrayList<Integer> coveredColumns;
    
    public Matrix(int i, int j){
        rows = new ArrayList<>(i);
        for(int q = 0; q < i; q++){
            rows.set(q, new ArrayList<>(j));
        }
        
        columns = new ArrayList<>(j);
        for(int q = 0; q < j; q++){
            columns.set(q, new ArrayList<>(i));
        }
    }

    public ArrayList<ArrayList<Integer>> getRows() {
        return rows;
    }

    public void setRows(ArrayList<ArrayList<Integer>> rows) {
        this.rows = rows;
    }

    public ArrayList<ArrayList<Integer>> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<ArrayList<Integer>> columns) {
        this.columns = columns;
    }

    public ArrayList<Integer[]> getStarredZeros() {
        return starredZeros;
    }

    public void setStarredZeros(ArrayList<Integer[]> starredZeros) {
        this.starredZeros = starredZeros;
    }

    public ArrayList<Integer[]> getPrimedZeros() {
        return primedZeros;
    }

    public void setPrimedZeros(ArrayList<Integer[]> primedZeros) {
        this.primedZeros = primedZeros;
    }

    public ArrayList<Integer> getCoveredRows() {
        return coveredRows;
    }

    public void setCoveredRows(ArrayList<Integer> coveredRows) {
        this.coveredRows = coveredRows;
    }

    public ArrayList<Integer> getCoveredColumns() {
        return coveredColumns;
    }

    public void setCoveredColumns(ArrayList<Integer> coveredColumns) {
        this.coveredColumns = coveredColumns;
    }
}

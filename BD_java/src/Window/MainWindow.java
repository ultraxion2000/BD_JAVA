
package Window;
import DB.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class MainWindow extends javax.swing.JFrame {
  
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        this.add(this.jButtonLoadFileRent);
        
         
    }

public ControllerDto Controllerdto= new ControllerDto();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLoadFileRent = new javax.swing.JTabbedPane();
        PanelWork = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableWork = new JTable();
        jButtonWork = new javax.swing.JButton();
        jButtonDeliteWorkRow = new javax.swing.JButton();
        jButtonSaveFileWork = new javax.swing.JButton();
        jButtonLoadFileWork = new javax.swing.JButton();
        jButtonLoadBDWork = new javax.swing.JButton();
        PanelShop = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableShop = new JTable();
        jButtonShop = new javax.swing.JButton();
        jButtonDeliteShopRow = new javax.swing.JButton();
        jButtonSaveFileShop = new javax.swing.JButton();
        jButtonLoadFileShop = new javax.swing.JButton();
        jButtonLoadBDShop = new javax.swing.JButton();
        PanelWork_ES = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableWork_ES = new JTable();
        jButtonWork_ES = new javax.swing.JButton();
        jButtonDeliteWork_ESRow = new javax.swing.JButton();
        jButtonSaveFileWork_ES = new javax.swing.JButton();
        jButtonLoadFileWork_ES = new javax.swing.JButton();
        jButtonLoadBDWork_ES = new javax.swing.JButton();
        PaneRent = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TableRent = new JTable();
        jButtonRent = new javax.swing.JButton();
        jButtonDeliteRentRow = new javax.swing.JButton();
        jButtonSaveFileRent = new javax.swing.JButton();
        ButtonLoadFileRent = new javax.swing.JButton();
        jButtonLoadBDRent = new javax.swing.JButton();
        PanelUsers = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUsers = new JTable();
        jButtonUser = new JButton();
        jButtonDeliteUsersRow = new JButton();
        jButtonSaveFileUser = new javax.swing.JButton();
        jButtonLoadFileUsers = new javax.swing.JButton();
        jButtonLoadBDUsers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Object CollomnWork[] = new Object[]{"id_user","id_work"};
        TableWork.setModel(new javax.swing.table.DefaultTableModel(CollomnWork,0
        ));
        RefrashWork();
        jScrollPane1.setViewportView(TableWork);

        jButtonWork.setText("Добавить строку");
        jButtonWork.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddRowWork();
            }});
            jButtonWork.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButtonWorkActionPerformed(evt);
                }
            });

            jButtonDeliteWorkRow.setText("Удалить строку");
            jButtonDeliteWorkRow.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DefaultTableModel model = (DefaultTableModel) TableWork.getModel();
                    if(TableWork.getSelectedRow() != -1) {
                        model.removeRow(TableWork.getSelectedRow());
                    }

                }});

                jButtonSaveFileWork.setText("Сохранить таблицу в файл");
                jButtonSaveFileWork.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonSaveFileWorkActionPerformed(evt);
                    }
                });

                jButtonLoadFileWork.setText("Загрузить таблицу из файла");
                jButtonLoadFileWork.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonLoadFileWorkActionPerformed(evt);
                    }
                });

                jButtonLoadBDWork.setText("Загрузить таблицу из БД");
                jButtonLoadBDWork.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButtonLoadBDWorkActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout PanelWorkLayout = new javax.swing.GroupLayout(PanelWork);
                PanelWork.setLayout(PanelWorkLayout);
                PanelWorkLayout.setHorizontalGroup(
                    PanelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWorkLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelWorkLayout.createSequentialGroup()
                                .addGroup(PanelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonDeliteWorkRow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
                                .addContainerGap())
                            .addGroup(PanelWorkLayout.createSequentialGroup()
                                .addGroup(PanelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButtonLoadBDWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLoadFileWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                                    .addComponent(jButtonSaveFileWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonWork, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                );
                PanelWorkLayout.setVerticalGroup(
                    PanelWorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelWorkLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonWork)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDeliteWorkRow)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSaveFileWork)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLoadFileWork)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLoadBDWork)
                        .addContainerGap(21, Short.MAX_VALUE))
                );

                jButtonLoadFileRent.addTab("Work", PanelWork);

                Object CollomnShop[] = new Object[]{"id", "Name Shop", "User_id", "Room_id"};
                TableShop.setModel(new javax.swing.table.DefaultTableModel(CollomnShop,0

                ) );
                RefrashShop();
                jScrollPane3.setViewportView(TableShop);

                jButtonShop.setText("Добавить строку");
                jButtonShop.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        AddRowShop();
                    }});
                    jButtonShop.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            jButtonShopActionPerformed(evt);
                        }
                    });

                    jButtonDeliteShopRow.setText("Удалить строку");
                    jButtonDeliteShopRow.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            DefaultTableModel model = (DefaultTableModel) TableShop.getModel();
                            if(TableShop.getSelectedRow() != -1) {
                                model.removeRow(TableShop.getSelectedRow());
                            }

                        }});

                        jButtonSaveFileShop.setText("Сохранить таблицу в файл");
                        jButtonSaveFileShop.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonSaveFileShopActionPerformed(evt);
                            }
                        });

                        jButtonLoadFileShop.setText("Загрузить таблицу из файла");
                        jButtonLoadFileShop.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonLoadFileShopActionPerformed(evt);
                            }
                        });

                        jButtonLoadBDShop.setText("Загрузить таблицу из БД");
                        jButtonLoadBDShop.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButtonLoadBDShopActionPerformed(evt);
                            }
                        });

                        javax.swing.GroupLayout PanelShopLayout = new javax.swing.GroupLayout(PanelShop);
                        PanelShop.setLayout(PanelShopLayout);
                        PanelShopLayout.setHorizontalGroup(
                            PanelShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelShopLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(PanelShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDeliteShopRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSaveFileShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLoadFileShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLoadBDShop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE))
                                .addContainerGap())
                        );
                        PanelShopLayout.setVerticalGroup(
                            PanelShopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelShopLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonShop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonDeliteShopRow, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSaveFileShop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonLoadFileShop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonLoadBDShop)
                                .addContainerGap(21, Short.MAX_VALUE))
                        );

                        jButtonLoadFileRent.addTab("Shop", PanelShop);

                        Object CollomnWork_ES[] = new Object[]{"Id", "Salary", "Name work"};
                        TableWork_ES.setModel(new javax.swing.table.DefaultTableModel(CollomnWork_ES,0

                        ) );
                        RefrashWork_ES();
                        jScrollPane4.setViewportView(TableWork_ES);

                        jButtonWork_ES.setText("Добавить строку");
                        jButtonWork_ES.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                AddRowWork_ES();
                            }});

                            jButtonDeliteWork_ESRow.setText("Удалить строку");
                            jButtonDeliteWork_ESRow.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    DefaultTableModel model = (DefaultTableModel) TableWork_ES.getModel();
                                    if(TableWork_ES.getSelectedRow() != -1) {
                                        model.removeRow(TableWork_ES.getSelectedRow());
                                    }

                                }});

                                jButtonSaveFileWork_ES.setText("Сохранить таблицу в файл");
                                jButtonSaveFileWork_ES.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButtonSaveFileWork_ESActionPerformed(evt);
                                    }
                                });

                                jButtonLoadFileWork_ES.setText("Загрузить таблицу из файла");
                                jButtonLoadFileWork_ES.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButtonLoadFileWork_ESActionPerformed(evt);
                                    }
                                });

                                jButtonLoadBDWork_ES.setText("Загрузить таблицу из БД");
                                jButtonLoadBDWork_ES.addActionListener(new java.awt.event.ActionListener() {
                                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                                        jButtonLoadBDWork_ESActionPerformed(evt);
                                    }
                                });

                                javax.swing.GroupLayout PanelWork_ESLayout = new javax.swing.GroupLayout(PanelWork_ES);
                                PanelWork_ES.setLayout(PanelWork_ESLayout);
                                PanelWork_ESLayout.setHorizontalGroup(
                                    PanelWork_ESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelWork_ESLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(PanelWork_ESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                                            .addComponent(jButtonWork_ES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonDeliteWork_ESRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonSaveFileWork_ES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonLoadFileWork_ES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButtonLoadBDWork_ES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap())
                                );
                                PanelWork_ESLayout.setVerticalGroup(
                                    PanelWork_ESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelWork_ESLayout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonWork_ES)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonDeliteWork_ESRow)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonSaveFileWork_ES)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonLoadFileWork_ES)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonLoadBDWork_ES)
                                        .addContainerGap(21, Short.MAX_VALUE))
                                );

                                jButtonLoadFileRent.addTab("Work ES", PanelWork_ES);

                                Object CollomnRent[] = new Object[]{"Id", "Price"};
                                TableRent.setModel(new javax.swing.table.DefaultTableModel(CollomnRent,0

                                )
                            );
                            RefrashRent();
                            jScrollPane5.setViewportView(TableRent);

                            jButtonRent.setText("Добавить строку");
                            jButtonRent.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    AddRowRent();
                                }});

                                jButtonDeliteRentRow.setText("Удалить строку");
                                jButtonDeliteRentRow.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        DefaultTableModel model = (DefaultTableModel) TableRent.getModel();
                                        if(TableRent.getSelectedRow() != -1) {
                                            model.removeRow(TableRent.getSelectedRow());
                                        }

                                    }});

                                    jButtonSaveFileRent.setText("Сохранить таблицу в файл");
                                    jButtonSaveFileRent.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            jButtonSaveFileRentActionPerformed(evt);
                                        }
                                    });

                                    ButtonLoadFileRent.setText("Загрузить таблицу из файла");
                                    ButtonLoadFileRent.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            ButtonLoadFileRentActionPerformed(evt);
                                        }
                                    });

                                    jButtonLoadBDRent.setText("Загрузить таблицу из БД");
                                    jButtonLoadBDRent.addActionListener(new java.awt.event.ActionListener() {
                                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                            jButtonLoadBDRentActionPerformed(evt);
                                        }
                                    });

                                    javax.swing.GroupLayout PaneRentLayout = new javax.swing.GroupLayout(PaneRent);
                                    PaneRent.setLayout(PaneRentLayout);
                                    PaneRentLayout.setHorizontalGroup(
                                        PaneRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PaneRentLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(PaneRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                                                .addComponent(jButtonRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonDeliteRentRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonSaveFileRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ButtonLoadFileRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonLoadBDRent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addContainerGap())
                                    );
                                    PaneRentLayout.setVerticalGroup(
                                        PaneRentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(PaneRentLayout.createSequentialGroup()
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonRent)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonDeliteRentRow)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonSaveFileRent)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ButtonLoadFileRent)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonLoadBDRent)
                                            .addGap(0, 21, Short.MAX_VALUE))
                                    );

                                    jButtonLoadFileRent.addTab("Rent", PaneRent);

                                    Object CollomnUser[] = new Object[]{"id", "login", "password", "name", "surname", "patronomic", "phone", "e_mail"};
                                    TableUsers.setModel(new javax.swing.table.DefaultTableModel(
                                        CollomnUser,0

                                    ));
                                    RefrashUser();
                                    jScrollPane2.setViewportView(TableUsers);

                                    jButtonUser.setText("Добавить строку");
                                    jButtonUser.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            AddRowUser();
                                        }});
                                        jButtonUser.addActionListener(new java.awt.event.ActionListener() {
                                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                jButtonUserActionPerformed(evt);
                                            }
                                        });

                                        jButtonDeliteUsersRow.setText("Удалить строку");
                                        jButtonDeliteUsersRow.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                DefaultTableModel model = (DefaultTableModel) TableUsers.getModel();
                                                if(TableUsers.getSelectedRow() != -1) {
                                                    model.removeRow(TableUsers.getSelectedRow());
                                                }

                                            }});

                                            jButtonSaveFileUser.setText("Сохранить таблицу в файл");
                                            jButtonSaveFileUser.addActionListener(new java.awt.event.ActionListener() {
                                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                    jButtonSaveFileUserActionPerformed(evt);
                                                }
                                            });

                                            jButtonLoadFileUsers.setText("Загрузить таблицу из файла");
                                            jButtonLoadFileUsers.addActionListener(new java.awt.event.ActionListener() {
                                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                    jButtonLoadFileUsersActionPerformed(evt);
                                                }
                                            });

                                            jButtonLoadBDUsers.setText("Загрузить таблицу из БД");
                                            jButtonLoadBDUsers.addActionListener(new java.awt.event.ActionListener() {
                                                public void actionPerformed(java.awt.event.ActionEvent evt) {
                                                    jButtonLoadBDUsersActionPerformed(evt);
                                                }
                                            });

                                            javax.swing.GroupLayout PanelUsersLayout = new javax.swing.GroupLayout(PanelUsers);
                                            PanelUsers.setLayout(PanelUsersLayout);
                                            PanelUsersLayout.setHorizontalGroup(
                                                PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PanelUsersLayout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addGroup(PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                                                        .addComponent(jButtonUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonDeliteUsersRow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonSaveFileUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonLoadFileUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButtonLoadBDUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addContainerGap())
                                            );
                                            PanelUsersLayout.setVerticalGroup(
                                                PanelUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(PanelUsersLayout.createSequentialGroup()
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButtonDeliteUsersRow)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButtonSaveFileUser)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButtonLoadFileUsers)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jButtonLoadBDUsers)
                                                    .addGap(0, 21, Short.MAX_VALUE))
                                            );

                                            jButtonLoadFileRent.addTab("Users", PanelUsers);

                                            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                                            getContentPane().setLayout(layout);
                                            layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jButtonLoadFileRent)
                                                    .addContainerGap())
                                            );
                                            layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addComponent(jButtonLoadFileRent)
                                                    .addContainerGap())
                                            );

                                            pack();
                                        }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveFileWork_ESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFileWork_ESActionPerformed
    Controllerdto.SavefileWork_Es((DefaultTableModel)TableWork_ES.getModel());
    }//GEN-LAST:event_jButtonSaveFileWork_ESActionPerformed

    private void jButtonSaveFileWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFileWorkActionPerformed
       Controllerdto.SavefileWork((DefaultTableModel)TableWork.getModel());
    }//GEN-LAST:event_jButtonSaveFileWorkActionPerformed

    private void jButtonSaveFileShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFileShopActionPerformed
        Controllerdto.SavefileShop((DefaultTableModel)TableShop.getModel());
    }//GEN-LAST:event_jButtonSaveFileShopActionPerformed

    private void jButtonSaveFileRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFileRentActionPerformed
       Controllerdto.SavefileRent((DefaultTableModel)TableRent.getModel());
    }//GEN-LAST:event_jButtonSaveFileRentActionPerformed

    private void jButtonSaveFileUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFileUserActionPerformed
        Controllerdto.SavefileUser((DefaultTableModel)TableUsers.getModel());
    }//GEN-LAST:event_jButtonSaveFileUserActionPerformed

    private void jButtonLoadFileWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFileWorkActionPerformed
       ClearTableWork();
       ControllerDto Controllerdtow= new ControllerDto();
       List<Object[]> List = Controllerdtow.loadFileWork();
               DefaultTableModel model = (DefaultTableModel) TableWork.getModel();
                            for(int i = 0; i < List.size(); i++) {
                                model.addRow(List.get(i));
                            }
    
    }//GEN-LAST:event_jButtonLoadFileWorkActionPerformed

    private void jButtonLoadBDWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadBDWorkActionPerformed
       ClearTableWork();
        RefrashWork();
    }//GEN-LAST:event_jButtonLoadBDWorkActionPerformed

    private void jButtonLoadFileShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFileShopActionPerformed
        ClearTableShop();
        ControllerDto Controllerdtos= new ControllerDto();
       List<Object[]> List = Controllerdtos.loadFileShop();
               DefaultTableModel model = (DefaultTableModel) TableShop.getModel();
                            for(int i = 0; i < List.size(); i++) {
                                model.addRow(List.get(i));
                            }
    }//GEN-LAST:event_jButtonLoadFileShopActionPerformed

    private void jButtonLoadBDShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadBDShopActionPerformed
        ClearTableShop();
        RefrashShop();
    }//GEN-LAST:event_jButtonLoadBDShopActionPerformed

    private void jButtonLoadFileWork_ESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFileWork_ESActionPerformed
         ClearTableWork_ES();
         ControllerDto Controllerdtoes= new ControllerDto();
       List<Object[]> List = Controllerdtoes.loadFileWork_ES();
               DefaultTableModel model = (DefaultTableModel) TableWork_ES.getModel();
                            for(int i = 0; i < List.size(); i++) {
                                model.addRow(List.get(i));
                            }
    }//GEN-LAST:event_jButtonLoadFileWork_ESActionPerformed

    private void jButtonLoadBDWork_ESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadBDWork_ESActionPerformed
        ClearTableWork_ES();
        RefrashWork_ES();
    }//GEN-LAST:event_jButtonLoadBDWork_ESActionPerformed

    private void ButtonLoadFileRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoadFileRentActionPerformed
           ClearTableRent();
           ControllerDto Controllerdtor= new ControllerDto();
       List<Object[]> List = Controllerdtor.loadFileRent();
               DefaultTableModel model = (DefaultTableModel) TableRent.getModel();
                            for(int i = 0; i < List.size(); i++) {
                                model.addRow(List.get(i));
                            }
    }//GEN-LAST:event_ButtonLoadFileRentActionPerformed

    private void jButtonLoadBDRentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadBDRentActionPerformed
        ClearTableRent();
        RefrashRent();
    }//GEN-LAST:event_jButtonLoadBDRentActionPerformed
 
    private void jButtonLoadFileUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFileUsersActionPerformed
         ClearTableUsers();
         ControllerDto Controllerdtou= new ControllerDto();
       List<Object[]> List = Controllerdtou.loadFileUsers();
               DefaultTableModel model = (DefaultTableModel) TableUsers.getModel();
                            for(int i = 0; i < List.size(); i++) {
                                model.addRow(List.get(i));
                            }
    }//GEN-LAST:event_jButtonLoadFileUsersActionPerformed

    private void jButtonLoadBDUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadBDUsersActionPerformed
        ClearTableUsers();
        RefrashUser();
    }//GEN-LAST:event_jButtonLoadBDUsersActionPerformed

    private void jButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUserActionPerformed

    private void jButtonShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonShopActionPerformed

    private void jButtonWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonWorkActionPerformed

    public void ClearTableRent(){
 DefaultTableModel model = (DefaultTableModel) TableRent.getModel();
model.setRowCount(0);
    }
      
    public void ClearTableUsers(){
 DefaultTableModel model = (DefaultTableModel) TableUsers.getModel();
model.setRowCount(0);
    }
    public void ClearTableShop(){
 DefaultTableModel model = (DefaultTableModel) TableShop.getModel();
model.setRowCount(0);
    }
    public void ClearTableWork(){
 DefaultTableModel model = (DefaultTableModel) TableWork.getModel();
model.setRowCount(0);
    }
    public void ClearTableWork_ES(){
 DefaultTableModel model = (DefaultTableModel) TableWork_ES.getModel();
model.setRowCount(0);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    public void RefrashUser(){
        ControllerDto Controllerdtou= new ControllerDto();
        try {
            Controllerdtou.LoadListUser();
          //  System.out.println(""+Controllerdto.ListUser.get(i).getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     DefaultTableModel model = (DefaultTableModel) TableUsers.getModel();

        for(int i=0;Controllerdtou.ListUser.size()>i ; i++){     
       model.addRow(new Object[]{Controllerdtou.ListUser.get(i).getId(), Controllerdtou.ListUser.get(i).getLogin(), Controllerdtou.ListUser.get(i).getPassword(),Controllerdtou.ListUser.get(i).getName(),Controllerdtou.ListUser.get(i).getSurname(),Controllerdtou.ListUser.get(i).getPatronomic(),Controllerdtou.ListUser.get(i).getPhone(),Controllerdtou.ListUser.get(i).getE_mail()});
        }
    
    }
     public void RefrashRent(){
         ControllerDto Controllerdtor= new ControllerDto();
        try {
            Controllerdtor.LoadListRent();
          //  System.out.println(""+Controllerdto.ListUser.get(i).getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     DefaultTableModel model = (DefaultTableModel) TableRent.getModel();

        for(int i=0;Controllerdtor.ListRent.size()>i ; i++){     
       model.addRow(new Object[]{Controllerdtor.ListRent.get(i).GetId(), Controllerdtor.ListRent.get(i).GetPrice()});
        }
    
    }
      public void RefrashShop(){
          ControllerDto Controllerdtos= new ControllerDto();
        try {
            Controllerdtos.LoadListShop();
          
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     DefaultTableModel model = (DefaultTableModel) TableShop.getModel();

        for(int i=0;Controllerdtos.ListShop.size()>i ; i++){     
       model.addRow(new Object[]{Controllerdtos.ListShop.get(i).GetId(), Controllerdtos.ListShop.get(i).GetName_Shop(), Controllerdtos.ListShop.get(i).GetUser_id(),Controllerdtos.ListShop.get(i).GetRoom_id()});
        }
      
    }
       public void RefrashWork(){
           ControllerDto Controllerdtow= new ControllerDto();
        try {
            Controllerdtow.LoadListWork();
          //  System.out.println(""+Controllerdto.ListUser.get(i).getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     DefaultTableModel model = (DefaultTableModel) TableWork.getModel();

        for(int i=0;Controllerdtow.ListWork.size()>i ; i++){     
       model.addRow(new Object[]{Controllerdtow.ListWork.get(i).getId_user(), Controllerdtow.ListWork.get(i).getId_work()});
        }
    
    }
        public void RefrashWork_ES(){
            ControllerDto Controllerdtoes= new ControllerDto();
        try {
            Controllerdtoes.LoadListWork_ES();
          //  System.out.println(""+Controllerdto.ListUser.get(i).getId());
            
        } catch (SQLException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
     DefaultTableModel model = (DefaultTableModel) TableWork_ES.getModel();

        for(int i=0;Controllerdtoes.ListWork_ES.size()>i ; i++){     
       model.addRow(new Object[]{Controllerdtoes.ListWork_ES.get(i).getId(), Controllerdtoes.ListWork_ES.get(i).getSalary(), Controllerdtoes.ListWork_ES.get(i).getName_work()});
        }
    
    }
        public void AddRowWork(){
    DefaultTableModel model = (DefaultTableModel) TableWork.getModel();  
    model.addRow(new Object[]{null, null,null,null,null,null,null,null});
    }  
        public void AddRowShop(){
    DefaultTableModel model = (DefaultTableModel) TableShop.getModel();
   
    model.addRow(new Object[]{null, null,null,null});
    }  
        public void AddRowUser(){
    DefaultTableModel model = (DefaultTableModel) TableUsers.getModel();
   
    model.addRow(new Object[]{null, null});
    }  
        public void AddRowRent(){
    DefaultTableModel model = (DefaultTableModel) TableRent.getModel();
    
    model.addRow(new Object[]{null, null});
    }  
    public void AddRowWork_ES(){
    DefaultTableModel model = (DefaultTableModel) TableWork_ES.getModel();
    
    model.addRow(new Object[]{null, null,null});
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonLoadFileRent;
    private javax.swing.JPanel PaneRent;
    private javax.swing.JPanel PanelShop;
    private javax.swing.JPanel PanelUsers;
    private javax.swing.JPanel PanelWork;
    private javax.swing.JPanel PanelWork_ES;
    private javax.swing.JTable TableRent;
    private javax.swing.JTable TableShop;
    private javax.swing.JTable TableUsers;
    private javax.swing.JTable TableWork;
    private javax.swing.JTable TableWork_ES;
    private javax.swing.JButton jButtonDeliteRentRow;
    private javax.swing.JButton jButtonDeliteShopRow;
    private javax.swing.JButton jButtonDeliteUsersRow;
    private javax.swing.JButton jButtonDeliteWorkRow;
    private javax.swing.JButton jButtonDeliteWork_ESRow;
    private javax.swing.JButton jButtonLoadBDRent;
    private javax.swing.JButton jButtonLoadBDShop;
    private javax.swing.JButton jButtonLoadBDUsers;
    private javax.swing.JButton jButtonLoadBDWork;
    private javax.swing.JButton jButtonLoadBDWork_ES;
    private javax.swing.JTabbedPane jButtonLoadFileRent;
    private javax.swing.JButton jButtonLoadFileShop;
    private javax.swing.JButton jButtonLoadFileUsers;
    private javax.swing.JButton jButtonLoadFileWork;
    private javax.swing.JButton jButtonLoadFileWork_ES;
    private javax.swing.JButton jButtonRent;
    private javax.swing.JButton jButtonSaveFileRent;
    private javax.swing.JButton jButtonSaveFileShop;
    private javax.swing.JButton jButtonSaveFileUser;
    private javax.swing.JButton jButtonSaveFileWork;
    private javax.swing.JButton jButtonSaveFileWork_ES;
    private javax.swing.JButton jButtonShop;
    private javax.swing.JButton jButtonUser;
    private javax.swing.JButton jButtonWork;
    private javax.swing.JButton jButtonWork_ES;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
